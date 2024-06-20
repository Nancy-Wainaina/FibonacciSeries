package com.example.fibonacciseries




import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.febonacciseries.R

class NumbersRecyclerViewAdapter (val fibonacciSeries:List<Int>):
    RecyclerView.Adapter<NumbersRecyclerViewAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.numbers_fibonacci, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(fibonacciSeries[position])
    }

    override fun getItemCount(): Int {
        return fibonacciSeries.size
    }
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.tvNumber)

        fun bind(fibonacciNumber: Int) {
            textView.text = fibonacciNumber.toString()
        }
    }

}