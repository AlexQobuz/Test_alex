package com.example.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BooksAdapter(var items: List<Book>) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    class BooksViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        var title: TextView
        var descrption: TextView
        var author: TextView
        var imageBook: ImageView
        var ratingBar: RatingBar

        init {
            title = itemView.findViewById(R.id.books_title)
            descrption = itemView.findViewById(R.id.book_description)
            author = itemView.findViewById(R.id.books_author)
            imageBook = itemView.findViewById(R.id.image_book)
            ratingBar = itemView.findViewById(R.id.rating_bar)
        }

        fun bind(book: Book) {
            title.text = book.title
            author.text = book.author
            descrption.text = book.description
            imageBook.setImageResource(book.image)
            ratingBar.rating = book.rating
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BooksViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        val book = items[position]
        holder.bind(book)
    }

    override fun getItemCount() = items.size

}