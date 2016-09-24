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

/**
 * DTO for Feedback - A type of viewing activity representing a user's feedback on viewing an item of content, including
 * a selected rating, and any written feedback ('message') they supplied.
 */
public class FeedbackDto {

  /** The user's (viewer's) selected rating for the content. */
  private Integer rating;

  /** The most recently entered textual feedback on the content supplied by the user (viewer). */
  private String message;

  /** The date/time the question was entered by the user. Supports offline viewings. */
  private String authored;

  /**
   * @param rating The user's (viewer's) selected rating for the content.
   */
  public FeedbackDto(Integer rating) {
    this.rating = rating;
  }

  /**
   * @param rating The user's (viewer's) selected rating for the content.
   * @param message The most recently entered textual feedback on the content supplied by the user (viewer), if any.
   * @param authored The date/time the question was entered by the user, if any. Supports offline viewings.
   */
  public FeedbackDto(Integer rating, String message, String authored) {
    this.rating = rating;
    this.message = message;
    this.authored = authored;
  }

  public Integer getRating() {
    return this.rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getAuthored() {
    return this.authored;
  }

  public void setAuthored(String authored) {
    this.authored = authored;
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("FeedbackDto [rating=");
    builder.append(rating);
    builder.append(", message=");
    builder.append(message);
    builder.append(", authored=");
    builder.append(authored);
    builder.append("]");
    return builder.toString();
  }
}