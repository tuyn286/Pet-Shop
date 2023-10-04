package com.laptrinhweb.controller.controllerImpl;

import com.laptrinhweb.Dto.MessageDto;
import com.laptrinhweb.controller.ContactController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class ContactControllerImpl extends BaseHomeController implements ContactController {
    @Autowired
    MailSender mailSender;
    @Override
    public ModelAndView contact() {
        modelAndView.setViewName("/guest/contact");
        modelAndView.addObject("messageDto",new MessageDto());
        return modelAndView;
    }

    @Override
    public ModelAndView sendMessage(@ModelAttribute MessageDto messageDto) {
        modelAndView.setView(new RedirectView("/contact"));
        sendMail(messageDto.getEmail(),"nguyenhoangtuyen286@gmail.com", messageDto.getSubject(), messageDto.getMessage());
        return modelAndView;
    }

    public void sendMail(String from, String to, String subject,String content){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(content);

        mailSender.send(mailMessage);
    }
}
