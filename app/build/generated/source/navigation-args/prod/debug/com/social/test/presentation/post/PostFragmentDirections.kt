package com.social.test.presentation.post

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.social.test.R
import com.social.test.domain.model.ItemPost
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class PostFragmentDirections private constructor() {
  private data class ActionVideoFragmentToVideoDetailFragment(
    public val postInfo: ItemPost
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_videoFragment_to_videoDetailFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(ItemPost::class.java)) {
        result.putParcelable("postInfo", this.postInfo as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(ItemPost::class.java)) {
        result.putSerializable("postInfo", this.postInfo as Serializable)
      } else {
        throw UnsupportedOperationException(ItemPost::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionVideoFragmentToVideoDetailFragment(postInfo: ItemPost): NavDirections =
        ActionVideoFragmentToVideoDetailFragment(postInfo)
  }
}
