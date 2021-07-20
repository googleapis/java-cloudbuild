/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloudbuild.v1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class SecretVersionName implements ResourceName {
  private static final PathTemplate PROJECT_SECRET_VERSION =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/secrets/{secret}/versions/{version}");
  private volatile Map<String, String> fieldValuesMap;
  private final String project;
  private final String secret;
  private final String version;

  @Deprecated
  protected SecretVersionName() {
    project = null;
    secret = null;
    version = null;
  }

  private SecretVersionName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    secret = Preconditions.checkNotNull(builder.getSecret());
    version = Preconditions.checkNotNull(builder.getVersion());
  }

  public String getProject() {
    return project;
  }

  public String getSecret() {
    return secret;
  }

  public String getVersion() {
    return version;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static SecretVersionName of(String project, String secret, String version) {
    return newBuilder().setProject(project).setSecret(secret).setVersion(version).build();
  }

  public static String format(String project, String secret, String version) {
    return newBuilder()
        .setProject(project)
        .setSecret(secret)
        .setVersion(version)
        .build()
        .toString();
  }

  public static SecretVersionName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PROJECT_SECRET_VERSION.validatedMatch(
            formattedString, "SecretVersionName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("secret"), matchMap.get("version"));
  }

  public static List<SecretVersionName> parseList(List<String> formattedStrings) {
    List<SecretVersionName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<SecretVersionName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (SecretVersionName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PROJECT_SECRET_VERSION.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (project != null) {
            fieldMapBuilder.put("project", project);
          }
          if (secret != null) {
            fieldMapBuilder.put("secret", secret);
          }
          if (version != null) {
            fieldMapBuilder.put("version", version);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PROJECT_SECRET_VERSION.instantiate(
        "project", project, "secret", secret, "version", version);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      SecretVersionName that = ((SecretVersionName) o);
      return Objects.equals(this.project, that.project)
          && Objects.equals(this.secret, that.secret)
          && Objects.equals(this.version, that.version);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(project);
    h *= 1000003;
    h ^= Objects.hashCode(secret);
    h *= 1000003;
    h ^= Objects.hashCode(version);
    return h;
  }

  /** Builder for projects/{project}/secrets/{secret}/versions/{version}. */
  public static class Builder {
    private String project;
    private String secret;
    private String version;

    protected Builder() {}

    public String getProject() {
      return project;
    }

    public String getSecret() {
      return secret;
    }

    public String getVersion() {
      return version;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setSecret(String secret) {
      this.secret = secret;
      return this;
    }

    public Builder setVersion(String version) {
      this.version = version;
      return this;
    }

    private Builder(SecretVersionName secretVersionName) {
      this.project = secretVersionName.project;
      this.secret = secretVersionName.secret;
      this.version = secretVersionName.version;
    }

    public SecretVersionName build() {
      return new SecretVersionName(this);
    }
  }
}
