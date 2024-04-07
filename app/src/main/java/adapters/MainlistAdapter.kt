package adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eatenapple.R


class MainlistAdapter  (
// private val list: List<Note>
): RecyclerView.Adapter<MainlistAdapter.MainViewHolder>() {

    private var mainList: List<MainFragment.Note> = listOf()

    fun setList(list: List<MainFragment.Note>) {
        mainList = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.note_item, parent, false)
        return MainViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mainList.count()
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.textView.text = mainList[position].name
    }

    class MainViewHolder(
        private val view: View
    ): RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(R.id.note_name)
        }
    }

}