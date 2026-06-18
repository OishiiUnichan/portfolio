package com.example.movielog;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieController {

  private final MovieService movieService;

  public MovieController(MovieService movieService) {
    this.movieService = movieService;
  }

  // 一覧画面
  @GetMapping("/")
  public String list(Model model) {
    List<Movie> movies = movieService.findAll();
    model.addAttribute("movies", movies);
    return "list";
  }

  // 登録画面
  @GetMapping("/new")
  public String newForm(Model model) {
    model.addAttribute("movie", new Movie());
    return "form";
  }

  // 登録処理
  @PostMapping("/save")
  public String save(@ModelAttribute Movie movie) {
    movieService.save(movie);
    return "redirect:/";
  }

  // 削除処理
  @PostMapping("/delete/{id}")
  public String delete(@PathVariable int id) {
    movieService.delete(id);
    return "redirect:/";
  }
}