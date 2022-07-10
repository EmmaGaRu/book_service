package service.interfaces;

import controller.dto.BookFormatDTO;
import controller.dto.FormatDTO;

public interface BookFormatService {

    FormatDTO store(BookFormatDTO bookFormatDTO);
    FormatDTO getAll(String isbn);
}
