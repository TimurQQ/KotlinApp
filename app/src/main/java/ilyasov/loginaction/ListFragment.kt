package ilyasov.loginaction

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.ArrayList

class ListFragment : Fragment() {

    private val items: MutableList<String> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_list_list, container, false) as RecyclerView
        for (i in 1..COUNT) {
            items.add("Item $i")
        }
        view.adapter = MyItemRecyclerViewAdapter(items)

        return view
    }

    companion object {
        private const val COUNT = 25
    }
}