package id.ac.bangkitshikigamies.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView
import id.ac.bangkitshikigamies.R
import id.ac.bangkitshikigamies.model.Shikigami

class ListShikigamiAdapter(private val listShikigami: ArrayList<Shikigami>): RecyclerView.Adapter<ListShikigamiAdapter.ViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallBack

    fun setOnItemClickCallBack(onItemClickCallback: OnItemClickCallBack){
        this.onItemClickCallback = onItemClickCallback
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvRole: TextView = itemView.findViewById(R.id.tv_item_role)
        var tvIcon: CircleImageView = itemView.findViewById(R.id.img_icon_shikigami)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_shikigami, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listShikigami.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val shikigami = listShikigami[position]

        Glide.with(holder.itemView.context)
            .load(shikigami.icon)
            .apply(RequestOptions())
            .into(holder.tvIcon)
        holder.tvName.text = shikigami.name
        holder.tvRole.text = shikigami.role
        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listShikigami[holder.adapterPosition])
        }
    }
}