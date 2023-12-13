package com.roundcircle.wyzard.corebackend.service;

import com.roundcircle.wyzard.corebackend.db.model.ClientAppsConfig;
import com.roundcircle.wyzard.corebackend.db.repository.ClientAppsConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientAppsConfigService {

    @Autowired
    private ClientAppsConfigRepository clientAppsConfigRepository;

    public ClientAppsConfig getClientAppsConfig(String clientName) {
        return clientAppsConfigRepository.findByClientName(clientName);
    }
}
