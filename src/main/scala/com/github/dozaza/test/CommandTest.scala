
package com.github.dozaza.test

import com.github.dozaza.command.{HashCommand, ListCommand, SetCommand, StringCommand}

object CommandTest {

  def test(): Unit = {
    testStringCommand()
    testListCommand()
    testSetCommand()
    testHashCommand()
  }

  private def testStringCommand(): Unit = {
    StringCommand.incr()
    StringCommand.decr()
    StringCommand.incrByFloat()
    StringCommand.append()
    StringCommand.getRange()
    StringCommand.setRange()
  }

  private def testListCommand(): Unit = {
    ListCommand.lrange()
    ListCommand.ltrim()
    ListCommand.blpop()
    ListCommand.brpop()
    ListCommand.rpoplpush()
    ListCommand.brpoplpush()
  }

  private def testSetCommand(): Unit = {
    SetCommand.sadd()
    SetCommand.sismember()
    SetCommand.scard()
    SetCommand.smembers()
    SetCommand.spop()
    SetCommand.smove()
    SetCommand.sdiff()
    SetCommand.sdiffstore()
    SetCommand.sinter()
    SetCommand.sinterstore()
    SetCommand.sunion()
    SetCommand.sunionstore()
  }

  private def testHashCommand(): Unit = {
    HashCommand.hmgetAndHmset()
    HashCommand.hdel()
    HashCommand.hexists()
    HashCommand.hkeys()
    HashCommand.hvals()
    HashCommand.hgetall()
    HashCommand.hincrby()
    HashCommand.hincrbyfloat()
  }
}
