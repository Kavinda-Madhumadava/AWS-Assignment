package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "aws")
public class UserEntity {
  private String name;
  private String password;
  private String profilePicUrl;
  private int userId;
  private String username;

  @Basic
  @Column(name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Basic
  @Column(name = "password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Basic
  @Column(name = "profile_pic_url")
  public String getProfilePicUrl() {
    return profilePicUrl;
  }

  public void setProfilePicUrl(String profilePicUrl) {
    this.profilePicUrl = profilePicUrl;
  }

  @Id
  @Column(name = "userId")
  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  @Basic
  @Column(name = "username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, name, username, password, profilePicUrl);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UserEntity that = (UserEntity) o;
    return userId == that.userId &&
        Objects.equals(name, that.name) &&
        Objects.equals(username, that.username) &&
        Objects.equals(password, that.password) &&
        Objects.equals(profilePicUrl, that.profilePicUrl);
  }
}
