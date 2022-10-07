package com.social.test.presentation.post_detail

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.social.test.domain.model.ItemPost
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class FragmentPostDetailArgs(
  public val postInfo: ItemPost
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): FragmentPostDetailArgs {
      bundle.setClassLoader(FragmentPostDetailArgs::class.java.classLoader)
      val __postInfo : ItemPost?
      if (bundle.containsKey("postInfo")) {
        if (Parcelable::class.java.isAssignableFrom(ItemPost::class.java) ||
            Serializable::class.java.isAssignableFrom(ItemPost::class.java)) {
          __postInfo = bundle.get("postInfo") as ItemPost?
        } else {
          throw UnsupportedOperationException(ItemPost::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__postInfo == null) {
          throw IllegalArgumentException("Argument \"postInfo\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"postInfo\" is missing and does not have an android:defaultValue")
      }
      return FragmentPostDetailArgs(__postInfo)
    }
  }
}
