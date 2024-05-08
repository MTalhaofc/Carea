import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.carea.databinding.FragmentInboxBinding
import com.google.android.material.tabs.TabLayoutMediator

class InboxFragment : Fragment() {

    private var fbinding: FragmentInboxBinding? = null
    private val binding get() = fbinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fbinding = FragmentInboxBinding.inflate(layoutInflater, container, false)

        // Set up ViewPager with two fragments
        val pagerAdapter = InboxPagerAdapter(childFragmentManager, lifecycle)
        binding?.viewPager?.adapter = pagerAdapter

        binding?.tabLayout?.newTab()?.let { binding?.tabLayout!!.addTab(it.setText("Chats")) }
        binding?.tabLayout?.newTab()?.let { binding?.tabLayout!!.addTab(it.setText("Calls")) }
        TabLayoutMediator(binding?.tabLayout!!, binding?.viewPager!!) { tab, position ->
            tab.text = when (position) {
                0 -> "Chat"
                else -> "Call"
            }
        }.attach()

        return fbinding?.root
    }
}
