package controller.interfaces;

import controller.dto.BookFormatDTO;
import controller.dto.FormatDTO;

public interface BookFormatController {

    FormatDTO store(BookFormatDTO bookFormatDTO);
    FormatDTO getAll(String isbn);
}