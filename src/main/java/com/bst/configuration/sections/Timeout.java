package com.bst.configuration.sections;

import lombok.Data;

@Data
public class Timeout {
    public int implicit;
    public int explicit;
    public int poolingInterval;
    public int page;
}
