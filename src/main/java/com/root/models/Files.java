package com.root.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Files {
  @Id
  private Long file_id;
  private String content;
  private String extension;
  private String related_table;
  private Long related_table_id;
  private Long created_user_id;

  public Long getFile_id() {
    return file_id;
  }

  public void setFile_id(Long file_id) {
    this.file_id = file_id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public String getRelated_table() {
    return related_table;
  }

  public void setRelated_table(String related_table) {
    this.related_table = related_table;
  }

  public Long getRelated_table_id() {
    return related_table_id;
  }

  public void setRelated_table_id(Long related_table_id) {
    this.related_table_id = related_table_id;
  }

  public Long getCreated_user_id() {
    return created_user_id;
  }

  public void setCreated_user_id(Long created_user_id) {
    this.created_user_id = created_user_id;
  }
}
