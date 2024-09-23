package top.hyzhu.springboot.configure.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hyzhu.springboot.configure.service.QrCodeService;

/**
 * @Author: zhy
 * @Description: QrCodeController
 * @Date: 2024-09-24 2:03
 **/

@RestController
@AllArgsConstructor
public class QrCodeController {
    private final QrCodeService qrCodeService;

    @GetMapping("/qrcode")
    public void qrcode() {
        qrCodeService.generateQrCode();
    }
}
