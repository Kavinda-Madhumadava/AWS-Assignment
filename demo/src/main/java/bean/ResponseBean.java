package bean;
import lombok.Data;

import java.util.List;

@Data
public class ResponseBean {
  int responseCode;
  int errorMsg;
  List<Object> data;
}