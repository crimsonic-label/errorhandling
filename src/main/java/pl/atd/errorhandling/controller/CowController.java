package pl.atd.errorhandling.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.atd.errorhandling.exception.CowNotFoundException;
import pl.atd.errorhandling.model.Cow;
import pl.atd.errorhandling.service.CowService;

@RestController
@RequestMapping("/api/cow")
public class CowController {

    private CowService cowService;

    public CowController(CowService cowService) {
        this.cowService = cowService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Cow getCow(@PathVariable Long id) throws CowNotFoundException {
        return cowService.getCow(id);
    }
}
