package com.jhust.moodLog

import org.springframework.data.repository.CrudRepository


interface LogRepository : CrudRepository<Log, Long> {}

interface UserRepository : CrudRepository<User, Long> {}

interface TagRepository : CrudRepository<Tag, Long> {}