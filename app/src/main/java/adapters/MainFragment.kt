package adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainFragment: Fragment() {
    private var binding: FragmentMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding?.root ?: super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val noteList = listOf<Note>(
            Note(name = "ExpNoteFirst", creationDate = 13.12, description = "First"),
            Note(name = "ExpNoteSecond", creationDate = 12.12, description = "Second"),
            Note(name = "ExpNoteThird", creationDate = 12.13, description = "Third")
        )
        val mainAdapter:MainlistAdapter = MainlistAdapter()
        binding?.mainList?.adapter = mainAdapter
        mainAdapter.setList(noteList)


    }
    data class Note(
        val name: String,
        val creationDate: Double,
        val description: String
    )
}