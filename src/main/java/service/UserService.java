package service;

import bean.ResponseBean;
import bean.UserRequestBean;

public interface UserService {
  public ResponseBean signIn(UserRequestBean userRequestBean) throws Exception;
  public ResponseBean createUser(UserRequestBean userRequestBean) throws Exception;
}
