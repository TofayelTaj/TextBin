package com.practice.TextBin.Services;

import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class UUidLink implements ILinkGenerator {
    @Override
    public String generateLink() {
        return "/past/"+UUID.randomUUID().toString();
    }
}
