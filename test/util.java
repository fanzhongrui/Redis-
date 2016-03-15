import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class util {
	public static byte[] serialize(Object ob){
		ObjectOutputStream oos = null;
		ByteArrayOutputStream baos = null;
		try{
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(ob);
			byte[] bytes = baos.toByteArray();
			return bytes;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	public static Object deserialize(byte[] bytes){
		ByteArrayInputStream bais = null;
		try{
			bais = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bais);
			return ois.readObject();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
