package com.abhishekb.devcreateproject.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abhishekb.devcreateproject.*
import com.abhishekb.devcreateproject.ui.dashboard.Food
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class HomeFragment : Fragment() {


    private lateinit var Item1:CardView
    private lateinit var Item2:CardView
    private lateinit var Item3:CardView
    private lateinit var Item4:CardView
    private lateinit var gridView: RecyclerView
    private lateinit var gridList:ArrayList<Grid>
    //private lateinit var adapter: GridAdapter
    private lateinit var mAuth: FirebaseAuth
    private lateinit var mDbRef: DatabaseReference
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

//        mAuth = FirebaseAuth.getInstance()
//        mDbRef = FirebaseDatabase.getInstance().getReference()



//        val cardTitle : Array<String> = resources.getStringArray(R.array.cardTitles)
//        val carImage : Array<String> = resources.getStringArray(R.array.cardImages)
//
//         adapter = GridAdapter(cardTitle,carImage)
//        val gridLayout = GridLayoutManager(requireContext(),2)
//        gridView = view.findViewById(R.id.cupon_gridView)
//        gridView.layoutManager= gridLayout
//        gridView.adapter=adapter


         Item1=view.findViewById(R.id.item1)
        Item2=view.findViewById(R.id.item1)
        Item1=view.findViewById(R.id.item1)
        Item1=view.findViewById(R.id.item1)

        Item1.setOnClickListener {
            startActivity(Intent(requireContext(), Electronics::class.java))

        }
        Item2.setOnClickListener {
            startActivity(Intent(requireContext(), Earphones::class.java))

        }
        Item3.setOnClickListener {
            startActivity(Intent(requireContext(), Clothing::class.java))

        }
        Item4.setOnClickListener {
            startActivity(Intent(requireContext(), Food::class.java))

        }



//        gridList = ArrayList()
//        gridImgList= ArrayList()
//        adapter = GridAdapter(requireContext(),,)

        //gridView = view.findViewById(R.id.cupon_gridView)

       // gridView.layoutManager= LinearLayoutManager(requireContext())
        //gridView.adapter = adapter


        return view
    }





}