package utility;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import model.PatientBean;

public class IDGenUtility {
	private static AtomicLong atomicCounter = new AtomicLong();
	PatientBean pb = new PatientBean();
	
	pb.
	public static String createID(){
		String currentCounter = String.valueOf(atomicCounter.getAndIncrement());
		String pb. = UUID.randomUUID().toString();
		
		return uniqueId + "-" + currentCounter;
	}

}
