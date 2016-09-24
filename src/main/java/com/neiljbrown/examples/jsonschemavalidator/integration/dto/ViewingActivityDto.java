/*
 * Copyright 2014-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.neiljbrown.examples.jsonschemavalidator.integration.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * DTO for the 'viewing activity' resource.
 */
public class ViewingActivityDto {

  /** The date and time the viewing activity was received (submitted) by the app, in the UTC time zone. */
  private String received;

  /** A list of {@link FeedbackDto feedback} submitted by the user. */
  private List<FeedbackDto> feedbacks = new ArrayList<FeedbackDto>();

  /**
   * @param received Date and time the viewing activity was received (submitted), in the UTC time zone.
   * @param feedbacks A list of {@link FeedbackDto feedback} submitted by the user.
   */
  public ViewingActivityDto(String received, List<FeedbackDto> feedbacks) {
    this.received = received;
    this.feedbacks = feedbacks;
  }

  /**
   * @return The date and time the viewing activity was received (submitted) by the app, in the UTC time zone.
   */
  public final String getReceived() {
    return received;
  }

  /** @return The list of {@link FeedbackDto}. Never null. */
  public List<FeedbackDto> getFeedbacks() {
    return this.feedbacks;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("ViewingActivityDto [received=");
    builder.append(received);
    builder.append(", feedbacks=");
    builder.append(feedbacks);
    builder.append("]");
    return builder.toString();
  }   
}