package com.example.spring.mongo.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.mongo.api.model.Player;
import com.example.spring.mongo.api.repository.PlayerRepository;

@RestController
public class PlayerController {

	@Autowired
	private PlayerRepository repository;

	@PostMapping("/addPlayer")
	public String savePlayer(@RequestBody Player player) {
		repository.save(player);
		return "Added player with id, name & team : " + player.getId() + " " +player.getPname()+ " "+player.getTeam();
	}

	@GetMapping("/findAllPlayers")
	public List<Player> getPlayers() {
		return repository.findAll();
	}
	@GetMapping("")
	public String getHi() {
		return "Hi";
	}

	@GetMapping("/findAllPlayers/{id}")
	public Optional<Player> getPlayer(@PathVariable int id) {
		return repository.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deletePlayer(@PathVariable int id) {
		repository.deleteById(id);
		return "player deleted with id : " + id;
	}

}
