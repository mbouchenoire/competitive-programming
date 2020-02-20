package com.mbouchenoire.competitive.programming.hashcode.qualification2020;

import com.mbouchenoire.competitive.programming.hashcode.common.HashCodeApplication;
import com.mbouchenoire.competitive.programming.hashcode.common.HashCodePhase;
import com.mbouchenoire.competitive.programming.hashcode.common.HashCodeSession;
import com.mbouchenoire.competitive.programming.hashcode.qualification2020.impl.BasicAlgorithm;
import com.mbouchenoire.competitive.programming.hashcode.qualification2020.impl.InputValueParser;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        final HashCodeSession session = new HashCodeSession(2020, HashCodePhase.QUALIFICATION);
        final HashCodeApplication hashCodeApplication = new HashCodeApplication(session);
        hashCodeApplication.run(new BasicAlgorithm(), new InputValueParser());
    }
}
