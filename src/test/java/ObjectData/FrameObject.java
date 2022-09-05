package ObjectData;

import java.util.HashMap;

public class FrameObject {

        private String singleFrameValue;
        private String multipleFrameValue;

    public FrameObject(HashMap<String, String> testData)
    {
        prepareData(testData);
    }

    public void prepareData(HashMap<String, String> testData)
    {
        for(String key:testData.keySet())
        {
            switch (key)
            {
                case "singleFrameValue":
                    setSingleFrameValue(testData.get(key));
                    break;
                case "multipleFrameValue":
                    setMultipleFrameValue(testData.get(key));
                    break;
            }
        }
    }

    public String getSingleFrameValue() {
        return singleFrameValue;
    }

    public void setSingleFrameValue(String singleFrameValue) {
        this.singleFrameValue = singleFrameValue;
    }

    public String getMultipleFrameValue() {
        return multipleFrameValue;
    }

    public void setMultipleFrameValue(String multipleFrameValue) {
        this.multipleFrameValue = multipleFrameValue;
    }
}
