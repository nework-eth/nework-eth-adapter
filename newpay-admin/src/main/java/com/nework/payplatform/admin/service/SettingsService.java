package com.nework.payplatform.admin.service;

import com.nework.payplatform.admin.dao.model.Configuration;

import java.util.List;

public interface SettingsService {

    List<Configuration> searchBasicSettings();
}
