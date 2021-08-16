package submission.andhiratobing.githubuser.view.fragments.favorite

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import submission.andhiratobing.githubuser.data.db.AppDatabase
import submission.andhiratobing.githubuser.data.db.FavoriteUserDao
import submission.andhiratobing.githubuser.data.model.UserEntity

class FavoriteViewModel(application: Application) : AndroidViewModel(application) {

    private var favoriteUserDao: FavoriteUserDao?
    private var appDatabase: AppDatabase? = AppDatabase.getDatabase(application)

    init {
        favoriteUserDao = appDatabase?.favoriteUserDao()
    }

    fun getFavoriteUser(): LiveData<List<UserEntity>> {
        return favoriteUserDao?.getFavoriteUser()!!
    }


}