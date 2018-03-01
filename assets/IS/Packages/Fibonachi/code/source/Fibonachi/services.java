package Fibonachi;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.softwareag.util.IDataMap;
// --- <<IS-END-IMPORTS>> ---

public final class services

{
	// ---( internal utility methods )---

	final static services _instance = new services();

	static services _newInstance() { return new services(); }

	static services _cast(Object o) { return (services)o; }

	// ---( server methods )---




	public static final void getModulus (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getModulus)>> ---
		// @sigtype java 3.5
		// [i] field:0:required num1
		// [i] field:0:required num2
		// [o] field:0:required modulus
		IDataMap idm = new IDataMap(pipeline);
		
		Integer num1 = idm.getAsInteger("num1");
		Integer num2 = idm.getAsInteger("num2");
		
		Integer modulus = num1 % num2;
		
		idm.put("modulus", modulus);
		// --- <<IS-END>> ---

                
	}
}

