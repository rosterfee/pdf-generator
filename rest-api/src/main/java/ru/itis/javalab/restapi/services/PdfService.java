package ru.itis.javalab.restapi.services;

import ru.itis.javalab.restapi.dto.UserInfoDTO;

/**
 * @author Киямдинов Ильдар
 * @project rest-api
 * @created 24.01.2022
 */

public interface PdfService {

    byte[] generatePdf(UserInfoDTO userInfoDTO, String statementType);

}
