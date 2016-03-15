
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;


public class testRedis {
	private Jedis jedis;
	public void setUp(){
		//connect to redis server ,127.0.0.1
		jedis = new Jedis("127.0.0.1", 6379);
		//auth permit
		jedis.auth("admin");
		Map<String, List<e1record> > m = new HashMap<>();
		//jedis.set("000", m);   
	}
	public Statement getPgStatement(){
		Connection c = null;
		Statement s = null;
		try{
			Class.forName("org.postgresql.Driver");
//			String dburl = "jdbc:postgresql://localhost:5432/1020?useUnicode=true&characterEncoding=utf8";
	        String dburl = "jdbc:postgresql://127.0.0.1:5432/test_zhenshi?useUnicode=true&characterEncoding=utf8";
			String dbuser = "postgre";
			String dbpwd = "passw0rd";
			c = DriverManager.getConnection(dburl, dbuser, dbpwd);
			s = c.createStatement();
		}catch(Exception e){
			e.printStackTrace();
		}
		return s;
	}
	public void test(Statement s, Jedis jedis){
		  String sql0 = "select * from e1record";
		  ResultSet rs ;
		  try{
			  rs = s.executeQuery(sql0);
			  while(rs.next()){
				  e1record e1 = new e1record();
				  e1.setAltitude(rs.getDouble("altitude"));
				  e1.setLatitude(rs.getDouble("latitude"));
				  e1.setLongitude(rs.getDouble("longitude"));
				  e1.setCapturetime(rs.getTimestamp("capturetime"));
				  e1.setConfidence(rs.getDouble("confidence"));
				  e1.setConfirm(rs.getInt("confirm"));
				  e1.setDatasource(rs.getString("datasource"));
				  e1.setFilename(rs.getString("filename"));
				  e1.setId(rs.getInt("id"));
				  e1.setIs_key(rs.getInt("is_key"));
				  e1.setIs_save(rs.getInt("is_save"));
				  e1.setIs_send(rs.getInt("transmit"));
				  e1.setNation(rs.getString("nation"));
				  e1.setParticularpara(rs.getString("particularpara"));
				  e1.setPlatformid(rs.getInt("platformid"));
				  e1.setPlatformlevel(rs.getString("platformlevel"));
				  e1.setPlatformname(rs.getString("platformname"));
				  e1.setPlatformtype(rs.getString("platformtype"));
				  e1.setPrimax(rs.getDouble("primax"));
				  e1.setPrimean(rs.getDouble("primean"));
				  e1.setPrimin(rs.getDouble("primin"));
				  e1.setPrinumber(rs.getInt("prinumber"));
				  e1.setPritype(rs.getString("pritype"));
				  e1.setPrmax(rs.getDouble("prmax"));
				  e1.setPrmean(rs.getDouble("prmean"));
				  e1.setPrmin(rs.getDouble("prmin"));
				  e1.setPrnumber(rs.getInt("prnumber"));
				  e1.setProducer(rs.getString("producer"));
				  e1.setPrtype(rs.getString("prtype"));
				  e1.setPwmax(rs.getDouble("pwmax"));
				  e1.setPwmean(rs.getDouble("pwmean"));
				  e1.setPwmin(rs.getDouble("pwmin"));
				  e1.setPwnumber(rs.getInt("pwnumber"));
				  e1.setPwtype(rs.getString("pwtype"));
				  e1.setRadarmodel(rs.getString("radarmodel"));
				  e1.setRelationid(rs.getInt("relationid"));
				  e1.setTaskid(rs.getString("taskid"));
				  e1.setTextquote(rs.getString("textquote"));
				  e1.setXposition(rs.getDouble("xposition"));
				  e1.setYposition(rs.getDouble("yposition"));
				  e1.setZposition(rs.getDouble("zposition"));
				  String id = String.valueOf(e1.getId());
				  
				  jedis.set(id.getBytes(), util.serialize(e1));
			  }
		  }catch(Exception e){
			  e.printStackTrace();
		  }
	}
	public static void main(String[] args){
		testRedis tr = new testRedis();
		tr.setUp();
		Statement s = tr.getPgStatement();
		tr.test(s, tr.jedis);
	}
}
