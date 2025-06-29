package ro.sisc.ttj.inttjence.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.sisc.ttj.inttjence.dtos.MessageDto;
import ro.sisc.ttj.inttjence.services.MessageService;

import java.util.List;

@RestController
@RequestMapping("/messages")
@AllArgsConstructor
@CrossOrigin("*")
public class MessageController {
    private final MessageService messageService;

    // Această metodă răspunde la GET /messages?model=DeepSeek
    @GetMapping
    public ResponseEntity<List<MessageDto>> getMessagesByModel(@RequestParam String model) {
        return ResponseEntity.ok(messageService.getMessagesByModel(model));
    }

    // Această metodă răspunde la POST /messages
    @PostMapping
    public ResponseEntity<MessageDto> createMessage(@RequestBody MessageDto messageDto) {
        return ResponseEntity.ok(messageService.createMessage(messageDto));
    }

    @PostMapping("/regenerate")
    public ResponseEntity<MessageDto> regenerateLastMessage(@RequestParam String model) {
        return ResponseEntity.ok(messageService.regenerateLastResponse(model));
    }

}

