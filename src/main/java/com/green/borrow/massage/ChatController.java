package com.green.borrow.massage;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/borrow")
@RestController
@RequiredArgsConstructor
public class ChatController {

    private final ChatService service;
}
