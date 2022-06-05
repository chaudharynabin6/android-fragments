package com.chaudharynabin6.fragments.fragment_manager

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.chaudharynabin6.fragments.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment1 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        parentFragmentManager.commit {
            setReorderingAllowed(true)
            add<Fragment4>(R.id.fragment_1_container_1, "fragment-4")
            add<Fragment5>(R.id.fragment_1_container_2, "fragment-5")
            add<Fragment6>(R.id.fragment_1_container_3, "fragment-6")
            addToBackStack("0")
        }

        parentFragmentManager.commit {
            Log.e("Fragment 1 :after primary navigation",parentFragmentManager.primaryNavigationFragment.toString())
        }
        for (item in 1..5){
            parentFragmentManager.commit {
                setReorderingAllowed(true)
                replace<Fragment6>(R.id.fragment_1_container_1, "fragment-4")
                replace<Fragment5>(R.id.fragment_1_container_2, "fragment-5")
                replace<Fragment4>(R.id.fragment_1_container_3, "fragment-6")
                addToBackStack(item.toString())
            }
        }

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val frag = parentFragmentManager.findFragmentByTag("fragment-1")
        Log.e("frag",frag.toString())
        parentFragmentManager.commit {
            Log.e("Fragment 1 :before primary navigation",parentFragmentManager.primaryNavigationFragment.toString())
            setPrimaryNavigationFragment(frag)
            Log.e("Fragment 1 :after primary navigation",parentFragmentManager.primaryNavigationFragment.toString())
        }

        Log.e("Fragment 1 : parent fragment manager", parentFragmentManager.fragments.toString())
        Log.e("Fragment 1 : child fragment manager", childFragmentManager.fragments.toString())
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}