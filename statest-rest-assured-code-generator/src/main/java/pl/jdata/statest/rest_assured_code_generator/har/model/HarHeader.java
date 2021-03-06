package pl.jdata.statest.rest_assured_code_generator.har.model;

import lombok.Data;

@Data
public class HarHeader {

    private String name;
    private String value;

    @Override
    public String toString() {
        return name + "=" + value;
    }
}
