import org.json.JSONObject;

import java.io.StringWriter;

class JsonEncoder {

    public static void main(String[] args){

        JSONObject obj = new JSONObject();

        obj.put("name","foo");
        obj.put("num",new Integer(100));
        obj.put("balance",new Double(1000.21));
        obj.put("is_vip",new Boolean(true));

        StringWriter out = new StringWriter();
        obj.write(out);

        String jsonText = out.toString();
        System.out.print(jsonText);
    }
}