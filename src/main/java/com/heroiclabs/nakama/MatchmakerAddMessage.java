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

import lombok.Data;

import java.util.Map;

/**
 * Add the user to the matchmaker pool with properties.
 */
@Data
class MatchmakerAddMessage {
    private int MinCount;
    private int MaxCount;
    private String Query;
    private Map<String, Double> NumericProperties;
    private Map<String, String> StringProperties;
    private int countMultiple;
}
