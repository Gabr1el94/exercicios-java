package acc.br.notas.controller

import acc.br.notas.model.Note
import acc.br.notas.repository.NoteRepository
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping("notes")
class NoteController {
    
    @Autowired
    lateinit var noteRepository: NoteRepository

    @GetMapping
    fun list(): List<Note> {
        return noteRepository.findAll().toList()
    }

    @PostMapping
    fun add(@RequestBody note: Note): Note {
        return noteRepository.save(note)
    }

    @PutMapping("{id}")
    fun alterNote(@PathVariable id: Long, @RequestBody note: Note): Note {
        return  if (noteRepository.existsById(id)) noteRepository.save(note) else Note()
    }

    @DeleteMapping("{id}")
    fun alterNote(@PathVariable id: Long) {
        if (noteRepository.existsById(id)) noteRepository.deleteById(id) 
    }

}