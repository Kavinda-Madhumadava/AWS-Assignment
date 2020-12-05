package dto;

public class UserDto {
  private String name;
  private String password;
  private String profilePicUrl;
  private int userId;
  private String username;

  public UserDto() {
  }

  public UserDto(String name, String password, String profilePicUrl, int userId, String username) {
    this.name = name;
    this.password = password;
    this.profilePicUrl = profilePicUrl;
    this.userId = userId;
    this.username = username;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getProfilePicUrl() {
    return profilePicUrl;
  }

  public void setProfilePicUrl(String profilePicUrl) {
    this.profilePicUrl = profilePicUrl;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String toString() {
    return "UserDto{" +
        "name='" + name + '\'' +
        ", password='" + password + '\'' +
        ", profilePicUrl='" + profilePicUrl + '\'' +
        ", userId=" + userId +
        ", username='" + username + '\'' +
        '}';
  }
}
