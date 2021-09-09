package submission.andhiratobing.githubuser.util.extension.image

import android.widget.ImageView
import com.bumptech.glide.Glide
import submission.andhiratobing.githubuser.R

object LoadImage {

    fun ImageView.loadImage(url: String?) {
        if (url != null) {
            Glide.with(this.context)
                .load(url)
                .placeholder(R.drawable.placeholder_image)
                .centerCrop()
                .into(this)
        } else return
    }
}