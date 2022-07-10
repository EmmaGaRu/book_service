package controller.implementations;

import controller.dto.BookFormatDTO;
import controller.dto.FormatDTO;
import controller.interfaces.BookFormatController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.interfaces.BookFormatService;

@RestController
public class BookFormatControllerImpl implements BookFormatController {

    @Autowired
    private BookFormatService bookFormatService;

    @Override
    @PostMapping("/book-format")
    @ResponseStatus(HttpStatus.CREATED)
    public FormatDTO store(@RequestBody BookFormatDTO bookFormatDTO) {

        return bookFormatService.store(bookFormatDTO);
    }

    @Override
    @GetMapping("/book-format/{isbn}")
    @ResponseStatus(HttpStatus.OK)
    public FormatDTO getAll(@PathVariable(name = "isbn") String isbn) {

        return bookFormatService.getAll(isbn);
    }
}
