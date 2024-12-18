/*
 * Copyright 2020 The Nakama Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.heroiclabs.nakama;

import com.google.common.util.concurrent.ListenableFuture;
import com.heroiclabs.nakama.api.Rpc;
import com.heroiclabs.nakama.rtapi.PartyJoin;
import com.heroiclabs.nakama.rtapi.PartyMatchmakerTicket;
import lombok.NonNull;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * A socket connection to the server.
 */
public interface SocketClient {
    /**
     * Connect to the server.
     * @param session The session of the user.
     * @param listener An event listener to notify on updates.
     * @return A future.
     */
    ListenableFuture<Session> connect(@NonNull final Session session, @NonNull final SocketListener listener);

    /**
     * Connect to the server.
     * @param session The session of the user.
     * @param listener An event listener to notify on updates.
     * @param createStatus True if the socket should show the user as online to others.
     * @return A future.
     */
    ListenableFuture<Session> connect(@NonNull final Session session, @NonNull final SocketListener listener, final boolean createStatus);

    /**
     * Close the connection with the server.
     * @deprecated
     * This method is deprecated. <p> Use {@link SocketClient#disconnectSocket()} instead.
     *
     * @return A close future.
     */
    ListenableFuture<Boolean> disconnect();

    /**
     * Close the connection with the server. This is an asynchronous call, and you should subscribe to OnClose callback to act on this.
     */
    void disconnectSocket();

    /**
     * Join a chat channel on the server.
     *
     * @param target The target channel to join.
     * @param type The type of channel to join.
     * @return A future which resolves to a Channel response.
     */
    ListenableFuture<Channel> joinChat(@NonNull final String target, @NonNull final ChannelType type);

    /**
     * Join a chat channel on the server.
     *
     * @param target The target channel to join.
     * @param type The type of channel to join.
     * @param persistence True if chat messages should be stored.
     * @return A future which resolves to a Channel response.
     */
    ListenableFuture<Channel> joinChat(@NonNull final String target, @NonNull final ChannelType type, boolean persistence);

    /**
     * Join a chat channel on the server.
     *
     * @param target The target channel to join.
     * @param type The type of channel to join.
     * @param persistence True if chat messages should be stored.
     * @param hidden True if the user should be hidden on the channel.
     * @return A future which resolves to a Channel response.
     */
    ListenableFuture<Channel> joinChat(@NonNull final String target, @NonNull final ChannelType type, boolean persistence, boolean hidden);

    /**
     * Leave a chat channel on the server.
     *
     * @param channelId The channel to leave.
     * @return A future.
     */
    ListenableFuture<Void> leaveChat(@NonNull final String channelId);

    /**
     * Remove a chat message from a channel on the server.
     *
     * @param channelId The chat channel with the message.
     * @param messageId The ID of a chat message to update.
     * @return A future.
     */
    ListenableFuture<ChannelMessageAck> removeChatMessage(@NonNull final String channelId, @NonNull final String messageId);

    /**
     * Send a chat message to a channel on the server.
     *
     * @param channelId The channel to send on.
     * @param content The content of the chat message.
     * @return A future which resolves to a Channel Ack response.
     */
    ListenableFuture<ChannelMessageAck> writeChatMessage(@NonNull final String channelId, @NonNull final String content);

    /**
     * Update a chat message to a channel on the server.
     *
     * @param channelId The ID of the chat channel with the message.
     * @param messageId The ID of the message to update.
     * @param content The content update for the message.
     * @return A future.
     */
    ListenableFuture<ChannelMessageAck> updateChatMessage(@NonNull final String channelId, @NonNull final String messageId, @NonNull final String content);

    /**
     * Create a multiplayer match on the server.
     *
     * @return A future.
     */
    ListenableFuture<Match> createMatch();

    /**
     * Join a multiplayer match by ID.
     *
     * @param matchId A match ID.
     * @return A future which resolves to the match joined.
     */
    ListenableFuture<Match> joinMatch(@NonNull final String matchId);

    /**
     * Join a multiplayer match by ID.
     *
     * @param matchId A match ID.
     * @param metadata An optional set of key-value metadata pairs to be passed to the match handler, if any.
     * @return A future which resolves to the match joined.
     */
    ListenableFuture<Match> joinMatch(@NonNull final String matchId, @NonNull Map<String, String> metadata);

    /**
     * Join a multiplayer match with a matchmaker.
     *
     * @param token A matchmaker ticket result object.
     * @return A future which resolves to the match joined.
     */
    ListenableFuture<Match> joinMatchToken(@NonNull final String token);

    /**
     * Leave a match on the server.
     *
     * @param matchId The match to leave.
     * @return A future.
     */
    ListenableFuture<Void> leaveMatch(@NonNull final String matchId);

    /**
     * Join the matchmaker pool and search for opponents on the server.
     *
     * @return A future which resolves to a matchmaker ticket object.
     */
    ListenableFuture<MatchmakerTicket> addMatchmaker();

    /**
     * Join the matchmaker pool and search for opponents on the server.
     *
     * @param minCount The minimum number of players to compete against.
     * @return A future which resolves to a matchmaker ticket object.
     */
    ListenableFuture<MatchmakerTicket> addMatchmaker(final int minCount);

    /**
     * Join the matchmaker pool and search for opponents on the server.
     *
     * @param minCount The minimum number of players to compete against.
     * @param maxCount The maximum number of players to compete against.
     * @return A future which resolves to a matchmaker ticket object.
     */
    ListenableFuture<MatchmakerTicket> addMatchmaker(final int minCount, final int maxCount);

    /**
     * Join the matchmaker pool and search for opponents on the server.
     *
     * @param query A matchmaker query to search for opponents.
     * @param minCount The minimum number of players to compete against.
     * @param maxCount The maximum number of players to compete against.
     * @return A future which resolves to a matchmaker ticket object.
     */
    ListenableFuture<MatchmakerTicket> addMatchmaker(final int minCount, final int maxCount, final String query);

    /**
     * Join the matchmaker pool and search for opponents on the server.
     *
     * @param query A matchmaker query to search for opponents.
     * @param minCount The minimum number of players to compete against.
     * @param maxCount The maximum number of players to compete against.
     * @param stringProperties A set of k/v properties to provide in searches.
     * @return A future which resolves to a matchmaker ticket object.
     */
    ListenableFuture<MatchmakerTicket> addMatchmaker(final int minCount, final int maxCount, final String query, final Map<String, String> stringProperties);

    /**
     * Join the matchmaker pool and search for opponents on the server.
     *
     * @param query A matchmaker query to search for opponents.
     * @param minCount The minimum number of players to compete against.
     * @param maxCount The maximum number of players to compete against.
     * @param stringProperties A set of k/v properties to provide in searches.
     * @param numericProperties A set of k/v numeric properties to provide in searches.
     * @return A future which resolves to a matchmaker ticket object.
     */
    ListenableFuture<MatchmakerTicket> addMatchmaker(final int minCount, final int maxCount, final String query, final Map<String, String> stringProperties, final Map<String, Double> numericProperties);

    /**
     * Leave the matchmaker pool by ticket.
     *
     * @param ticket The ticket returned by the matchmaker on join. See IMatchmakerTicket.Ticket.
     * @return A future.
     */
    ListenableFuture<Void> removeMatchmaker(@NonNull final String ticket);

    /**
     * Send a state change to a match on the server.
     *
     * When no presences are supplied the new match state will be sent to all presences.
     *
     * @param matchId The Id of the match.
     * @param opCode An operation code for the match state.
     * @param data The new state to send to the match.
     */
    void sendMatchData(@NonNull final String matchId, final long opCode, @NonNull byte[] data);

    /**
     * Send a state change to a match on the server.
     *
     * When no presences are supplied the new match state will be sent to all presences.
     *
     * @param matchId The Id of the match.
     * @param opCode An operation code for the match state.
     * @param data The new state to send to the match.
     * @param presences The presences in the match to send the state.
     */
    void sendMatchData(@NonNull final String matchId, final long opCode, @NonNull byte[] data, UserPresence... presences);

    /**
     * Send an RPC message to the server.
     *
     * @param id The ID of the function to execute.
     * @return A future which resolves to an RPC response.
     */
    ListenableFuture<Rpc> rpc(@NonNull final String id);

    /**
     * Send an RPC message to the server.
     *
     * @param id The ID of the function to execute.
     * @param payload The string content to send to the server.
     * @return A future which resolves to an RPC response.
     */
    ListenableFuture<Rpc> rpc(@NonNull final String id, final String payload);

    /**
     * Follow one or more users for status updates.
     *
     * @param userIds The user Ids to follow.
     * @return A future.
     */
    ListenableFuture<Status> followUsers(@NonNull final String... userIds);

    /**
     * Follow one or more users for status updates.
     *
     * @param userIds The user Ids to follow.
     * @param usernames Usernames to follow.
     * @return A future.
     */
    ListenableFuture<Status> followUsers(final List<String> userIds, final String... usernames);

    /**
     * Unfollow status updates for one or more users.
     *
     * @param userIds The ids of users to unfollow.
     * @return A future.
     */
    ListenableFuture<Void> unfollowUsers(@NonNull final String... userIds);

    /**
     * Update the user's status online.
     *
     * @param status The new status of the user.
     * @return A future.
     */
    ListenableFuture<Void> updateStatus(final String status);

    /**
     * Create a party.
     *
     * @param open Whether the party will require join requests to be approved by the party leader.
     * @param maxSize Maximum number of party members.
     * @return A future which resolves to the party created.
     */
    ListenableFuture<Party> createParty(final boolean open, final int maxSize);

    /**
     * Join a party.
     *
     * @param partyId A party ID.
     */
    ListenableFuture<Void> joinParty(@NonNull final String partyId);

    /**
     * Leave a party.
     *
     * @param partyId A party ID.
     */
    ListenableFuture<Void> leaveParty(@NonNull final String partyId);

    /**
     * Promote a member to party leader.
     *
     * @param partyId A party ID.
     * @param userPresence The presence of an existing party member to promote as the new leader.
     */
    ListenableFuture<Void> promoteParty(@NonNull final String partyId, UserPresence userPresence);

    /**
     * Accept a member to a party.
     *
     * @param partyId Party ID to accept a join request for.
     * @param userPresence The presence to accept as a party member.
     */
    ListenableFuture<Void> acceptParty(@NonNull final String partyId, UserPresence userPresence);

    /**
     * Remove/reject a member from a party.
     *
     * @param partyId Party ID to remove/reject from.
     * @param userPresence The presence to remove or reject.
     */
    ListenableFuture<Void> removeParty(@NonNull final String partyId, UserPresence userPresence);

    /**
     * End a party.
     *
     * @param partyId A party ID.
     */
    ListenableFuture<Party> closeParty(@NonNull final String partyId);

    /**
     * Lists pending join requests for a party.
     *
     * @param partyId A party ID.
     */
    ListenableFuture<PartyJoinRequest> listPartyJoinRequest(@NonNull final String partyId);

    /**
     * Begin matchmaking as a party.
     *
     * @param minCount Minimum total user count to match together.
     * @param maxCount Maximum total user count to match together.
     * @param query Filter query used to identify suitable users.
     * @param stringProperties A set of k/v properties to provide in searches.
     * @param numericProperties A set of k/v numeric properties to provide in searches.
     * @param countMultiple Optional multiple of the count that must be satisfied.
     * @return A future which resolves to a party matchmaker ticket object.
     */
    ListenableFuture<PartyMatchmakerTicket> addPartyMatchmaker(@NonNull final String partyId, final int minCount, final int maxCount, @NonNull final String query,
                                                               final Map<String, String> stringProperties, final Map<String, Double> numericProperties, final int countMultiple);

    /**
     * Cancel a party matchmaking process using a ticket.
     *
     * @param partyId A party ID.
     * @param partyId The ticket to cancel.
     */
    ListenableFuture<Void> removePartyMatchmaker(@NonNull final String partyId, @NonNull final String ticket);

    /**
     * Send party data.
     *
     * @param partyId The ID of the party.
     * @param opCode An operation code for the party state.
     * @param data The new state to send to the party.
     */
    void sendPartyData(@NonNull final String partyId, final int opCode, @NonNull byte[] data);
}
