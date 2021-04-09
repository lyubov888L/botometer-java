/*
 * Copyright 2019 FJOBI Labs Softwareentwicklung - Felix Jordan
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     https://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.fjobilabs.botometer;

/**
 * @since 0.1.0
 * @author Felix Jordan
 */
public interface DisplayScores {
    
    float getContent();
    
    float getEnglish();
    
    float getFriend();
    
    float getNetwork();
    
    float getSentiment();
    
    float getTemporal();
    
    float getUniversal();
    
    float getUser();
}
