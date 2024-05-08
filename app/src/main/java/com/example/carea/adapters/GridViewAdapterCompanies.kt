package com.example.carea.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.carea.R
import com.example.carea.models.GridViewModalCompanies

// on below line we are creating an
// adapter class for our grid view.
internal class GridViewAdapterCompanies(
    // on below line we are creating two
    // variables for course list and context
    private val companiesList: List<GridViewModalCompanies>,
    private val context: Context
) :
    BaseAdapter() {
    // in base adapter class we are creating variables
    // for layout inflater, course image view and course text view.
    private var layoutInflater: LayoutInflater? = null
    private lateinit var companyName: TextView
    private lateinit var companyLogo: ImageButton

    // below method is use to return the count of course list
    override fun getCount(): Int {
        return companiesList.size
    }

    // below function is use to return the item of grid view.
    override fun getItem(position: Int): Any? {
        return null
    }

    // below function is use to return item id of grid view.
    override fun getItemId(position: Int): Long {
        return 0
    }

    // in below function we are getting individual item of grid view.
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        // on blow line we are checking if layout inflater
        // is null, if it is null we are initializing it.
        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        // on the below line we are checking if convert view is null.
        // If it is null we are initializing it.
        if (convertView == null) {
            // on below line we are passing the layout file
            // which we have to inflate for each item of grid view.
            convertView = layoutInflater!!.inflate(R.layout.card_companies_option, null)
        }
        // on below line we are initializing our companies image view
        // and companies name text view with their ids.
        companyLogo = convertView!!.findViewById(R.id.ib_company_logo)
        companyName = convertView.findViewById(R.id.tv_company_name)
        // on below line we are setting image for our course image view.
        companyLogo.setImageResource(companiesList[position].companyLogo)
        // on below line we are setting text in our course text view.
        companyName.text = companiesList[position].companyName
        // at last we are returning our convert view.
        return convertView
    }
}