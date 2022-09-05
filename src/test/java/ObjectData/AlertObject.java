package ObjectData;

import java.util.HashMap;

public class AlertObject {

    private String message;

    public AlertObject(HashMap<String, String> testData)
    {
        prepareData(testData);
    }

    public void prepareData(HashMap<String, String> testData)
    {
        for(String key:testData.keySet())
        {
            switch (key)
            {
                case "message":
                    setMessage(testData.get(key));
                    break;

            }
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
