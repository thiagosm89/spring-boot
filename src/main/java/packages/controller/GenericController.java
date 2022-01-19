package packages.controller;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

abstract class GenericController {

    protected final ModelMapper modelMapper;

    protected GenericController(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    protected <IN, OUT> OUT convertToService(IN entity, Class<OUT> clazz) {
        return modelMapper.map(entity, clazz);
    }

    protected <T> ResponseEntity<T> responseOk(T entity) {
        return ResponseEntity.ok(entity);
    }

    protected <IN, OUT> ResponseEntity<OUT> responseCreated(IN entity, Class<OUT> dtoClazz) {
        OUT out = modelMapper.map(entity, dtoClazz);

        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(out);
    }

}
