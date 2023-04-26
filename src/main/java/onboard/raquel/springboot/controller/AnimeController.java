package onboard.raquel.springboot.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import onboard.raquel.springboot.domain.Anime;
import onboard.raquel.springboot.util.DateUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
//@AllArgsConstructor
@RequiredArgsConstructor
public class AnimeController {
    //@Autowired
    //private DateUtil dateUtil;
    private final DateUtil dateUtil;

//    public AnimeController(DateUtil dateUtil) {
//        this.dateUtil = dateUtil;
//    }

    //localhost:8080/anime/list
    //@RequestMapping(method = RequestMethod.GET, path = "list")
    @GetMapping(path = "list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Boku no Hero"), new Anime("Berserk"));
    }

    @GetMapping(path = "list2")
    public List<Anime> list2(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Boku no Hero"), new Anime("Berserk"), new Anime("One Piece"));
    }
}
