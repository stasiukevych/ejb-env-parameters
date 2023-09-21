package ejb;


import jakarta.annotation.Resource;
import jakarta.ejb.Stateless;

@Stateless
public class Config {

  @Resource(name = "connection")
  private String dbConnection;

  @Resource(name = "dataSource")
  private String dataSourcePath;

  @Resource(name = "port")
  private Integer port;

  @Resource(name = "timeout")
  private Integer timeout;

  public String getDbConnection() {
    return dbConnection;
  }

  public String getDataSourcePath() {
    return dataSourcePath;
  }

  public Integer getPort() {
    return port;
  }

  public Integer getTimeout() {
    return timeout;
  }

  public String buildConnectionInfo() {
    return String.format(
        "Connection[%s] with dataSource[%s] on port[%d] with timeout[%d] min.",
        dbConnection, dataSourcePath, port, timeout
    );
  }
}